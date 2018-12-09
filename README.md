# Problematic Code

Demo for mutation testing.

Branches:
* equals-problem
    * Wrong code
    * `equals` and `hashCode` methods are not updated after adding `status` property
* equals-solution
    * Right code
    * Without `equals` and `hashCode` methods
    * Using `EqualsBuilder.reflectionEquals` from _Apache Commons Lang_
* conditional-boundary-problem
    * Wrong code
    * There is no test for boundary condition
* conditional-boundary-solution
    * Right code
    * There is a test for boundary condition

In order to see the differences:

```
git diff equals-problem equals-solution
git diff conditional-boundary-problem conditional-boundary-solution
```

or:

```
git difftool equals-problem equals-solution
git difftool conditional-boundary-problem conditional-boundary-solution
```

if you have a tool for managing differences (config: `diff.tool`).

## Running mutation testing

```
mvn clean test; mvn org.pitest:pitest-maven:mutationCoverage
```

## Further reading
[99% code coverage - Do we have a good safety net to change this legacy code?](https://rachelcarmena.github.io/2017/09/01/do-we-have-a-good-safety-net-to-change-this-legacy-code.html)
