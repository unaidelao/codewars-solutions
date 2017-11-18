/**
 * Jenny's Secret Message kata - C#
 *
 * Jenny has written a function that returns a greeting for a user. However,
 * she's in love with Johnny, and would like to greet him slightly different.
 *
 * She added a special case to her function, but she made a mistake.
 * Can you help her?
 *
 * Author: Unai de la O
 */

 using System;

 public class JennySecretMessage {
   public static string greet(string name) {
     return (name == "Johnny") ? "Hello, my love!" : "Hello, " + name +"!";
   }
 }
