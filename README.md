# TrigJavaLibrary
The java math libraries have all the trig metric functions. What if it didn’t exist..?

This project consists of raw implementation of standard Trig Functions (SIN, COS, TAN as well as their inverses).

techniqeues to use library have been exemplified in TestHarness.java, however some tips are, inverse functions take normal x values and return them in radians.

all other functions x must be converted toDeg/toRadian depending on what format user wants answer to be in using helper methods and then PASSED INTO required function

Example: Sin degrees, convert x to degrees using helper func xToDegrees and pass into sin function. answer will be in degrees

Example: Secant radians, convert x to radians using helper func xToRadian and pass into secant func. answer will be in radians

