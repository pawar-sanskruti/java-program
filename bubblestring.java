class bubblestring{
    public static void main(String[] args){

        String temp;
        
        String[] a={"komal","rupali","pratiksha","saniya","ankita"};
        for(int i=0;i<a.length;i++){
            int  flag = 0;
            for(int j=0;j<a.length-1-i;j++){

                if(a[j].compareTo(a[j+1])>0){

                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;

                }
            }
            if(flag==0){
                break;
            }
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
}
}