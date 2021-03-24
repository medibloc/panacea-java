# Panacea Java SDK

## Installation

### Gradle

```gradle
repositories {
    maven {
        url = "https://maven.pkg.github.com/medibloc/panacea-java"
        // GitHub Packages credentials
        credentials {
            username = System.getenv("GPR_USER")
            password = System.getenv("GPR_API_KEY")
        }
    }
    mavenCentral()
}

dependencies {
    compile group: 'org.medibloc.panacea', name: 'panacea-java', version: '0.1.4'
}
```

## Examples

- [PanaceaApiRestClientTest](src/test/java/org/medibloc/panacea/PanaceaApiRestClientTest.java)
