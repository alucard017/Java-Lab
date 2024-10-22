public class Sorting
{
  public static void main(String[] args)
  {
    int size = args.length;
    int[] array = new int[size];
    for(int i = 0; i < size; i++)
    {
      array[i] = Integer.parseInt(args[i]);
    }
    for(int i = 1; i < size; i++)
    {
      int key = array[i];
      int j = i-1;
      while(j >= 0 && array[j] > key)
      {
       array[j+1] = array[j];
       j--;
      }
      array[j+1] = key;
    }
    for(int i = 0; i < size-1; i++)
    {
      System.out.print(array[i]+", ");
    }
    System.out.println(array[size-1]);
  }
}
