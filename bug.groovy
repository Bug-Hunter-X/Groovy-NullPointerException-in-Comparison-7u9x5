```groovy
def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // Output: 5
println myMethod(2, 7) // Output: 7
println myMethod(null, 3) // Unexpected behavior
```