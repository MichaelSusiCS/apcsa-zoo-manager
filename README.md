# apcsa-zoo-manager (Java 17)

Manage a tiny zoo: add/list animals, feed all, search by name.

## Run
```bash
find src -name "*.java" | xargs javac -d out
java -cp out Main

cd ~/dev/apcsa-zoo-manager

cat > .github/workflows/build.yml << 'EOF'
name: Build
on: [push, pull_request]
jobs:
  build:
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v4
      - uses: actions/setup-java@v4
        with:
          distribution: temurin
          java-version: '17'

      - name: Show Java & list files
        run: |
          java -version
          javac -version
          ls -R

      - name: Compile
        run: |
          mkdir -p out
          javac -d out $(git ls-files '*.java')

      - name: Smoke test (quit immediately)
        run: |
          printf "q\n" | java -cp out Main
