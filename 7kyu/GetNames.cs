//
// Get names - C#
//
// The following code is not giving the expected results. Can you figure out what the issue is?
public class Kata
{
    public static string[] GetNames(Person[] data)
    {
        string[] result  = new string[data.Length];
        for (int i = 0; i < data.Length; i++)
        {
            result[i] = data[i].Name;
        }
        return result;
    }
}