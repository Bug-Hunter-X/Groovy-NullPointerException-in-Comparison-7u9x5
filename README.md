# Groovy NullPointerException in Comparison

This example demonstrates a common issue in Groovy related to null values and comparisons.  Groovy's dynamic typing, while flexible, can lead to unexpected `NullPointerExceptions` if not handled correctly.

The `myMethod` function intends to return the larger of two numbers. However, when a null value is passed, a `NullPointerException` is thrown because the `>` operator cannot be applied to null.  The solution below shows how to add a null check to prevent this exception.