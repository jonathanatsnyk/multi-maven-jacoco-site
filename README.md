# Multi-maven Jacoco Site

Create aggregated jacoco report with seperated parent/aggregator pom's.

```bash
mvn package site && mvn site:stage
```
Resulted site at `target/staging`