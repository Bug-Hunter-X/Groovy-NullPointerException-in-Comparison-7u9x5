```groovy
def myMethod(a, b) {
  if (a == null && b == null) return null //Handle both null
  if (a == null) return b // Handle a is null
  if (b == null) return a // Handle b is null
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // Output: 5
println myMethod(2, 7) // Output: 7
println myMethod(null, 3) // Output: 3
println myMethod(5, null) // Output: 5
println myMethod(null, null) //Output: null
```