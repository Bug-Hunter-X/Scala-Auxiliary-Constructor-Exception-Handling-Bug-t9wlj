# Scala Auxiliary Constructor Exception Handling

This repository demonstrates a common bug in Scala related to exception handling within auxiliary constructors.  The primary issue arises when attempting to convert a String to an Int within an auxiliary constructor without proper error handling.  This can lead to unexpected behavior and potential runtime exceptions.

The `MyClass` example shows the correct way to handle this situation.  In contrast, `MyClass2` demonstrates an incorrect and error-prone approach, using a try-catch block that silently handles the NumberFormatException and sets a default value. While seemingly convenient, it masks potential issues.

## Bug Details

The core problem lies in how `MyClass2` deals with `NumberFormatException`.  The primary constructor requires an integer, which is converted from the input string in the auxiliary constructor. The try-catch block may seem to handle potential errors (such as the input string "abc"), but the improper way to handle the exception might fail to alert the user when such exception occurs, making it hard to debug such problems.