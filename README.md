# Problematic Code

Demo for mutation testing.

Master branch: 
* Wrong code
* `equals` and `hashCode` methods are not updated after adding `status` property.

Solution branch: 
* Right code
* Without `equals` and `hashCode` methods
* Using `EqualsBuilder.reflectionEquals` from _Apache Commons Lang_

## Running mutation testing

```
mvn clean test; mvn org.pitest:pitest-maven:mutationCoverage
```
