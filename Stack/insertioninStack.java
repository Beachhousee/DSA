// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Stack;

public class insertioninStack {
   public insertioninStack() {
   }

   public static void main(String[] var0) {
      Stack var1 = new Stack();
      var1.push(1);
      var1.push(2);
      var1.push(3);
      var1.push(4);
      var1.push(5);
      System.out.println(var1);
      byte var2 = 2;
      byte var3 = 7;
      Stack var4 = new Stack();

      while(var1.size() > var2) {
         var4.push((Integer)var1.pop());
      }

      var1.push(Integer.valueOf(var3));

      while(var4.size() > 0) {
         var1.push((Integer)var4.pop());
      }

      System.out.println(var1);
   }
}
