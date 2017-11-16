/*
 * Correct the mistakes of the character recognition software - C#
 *
 * Character recognition software is widely used to digitise printed texts.
 * Thus the texts can be edited, searched and stored on a computer.
 * When documents (especially pretty old ones written with a typewriter),
 * are digitised character recognition softwares often make mistakes.
 *
 * Your task is correct the errors in the digitised text. You only have to
 * handle the following mistakes:
 *     S is misinterpreted as 5
 *     O is misinterpreted as 0
 *     I is misinterpreted as 1
 *
 * The test cases contain numbers only by mistake.
 *
 * Author: Unai de la O
 */

 using System;

 public class CorrectMistakesInputChar
{
  public static string Correct(string text)
  {
    return text.Replace("5", "S").Replace("0", "O").Replace("1", "I");
  }
}
