/*
    Welcome to the city - Java
    
    Create a method sayHello/say_hello/SayHello that takes as input a name, city, and state to
    welcome a person. Note that name will be an array consisting of one or more values that should
    be joined together with one space betweeen each, and the length of the name array in test cases
    will vary.

    Author: Unai de la O
 */
using System;

public class WelcomeToTheCity
{
  public static string SayHello(string[] name, string city, string state)
  {
    string fullName = "";
    
    foreach (string s in name) {
      fullName += " " + s;
    }
    return String.Format("Hello,{0}! Welcome to {1}, {2}!", fullName, city, state);
  }
}