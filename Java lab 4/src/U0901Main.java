public class U0901Main {
    public static void main(String[] args){
        Integer intArr[]={10,20,15};
        Float floatArr[]={0.0f,0.0f,0.0f};
        String s[]={"aaa","bbb"};
        for (int i=0;i<3;i++){
            floatArr[i]=(float)Math.random();
            //System.out.println(floatArr[i]);
        }
        U0901WorkArray insWorkArrayInt=new U0901WorkArray(intArr);
        U0901WorkArray insWorkArrayFloat=new U0901WorkArray(floatArr);
        //U0901WorkArray ss=new U0901WorkArray(s);
        System.out.println(insWorkArrayInt.sum());
        System.out.print(insWorkArrayFloat.sum());
    }
}
