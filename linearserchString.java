public class linearserchString {
    public static void main(String args[]){
        String[] arr={"komal","deepak","sakshi","saniya"};

        String item="sakshi";
        int temp=0;

        for(int i=0;i<arr.length;i++){
             
            if(arr[i].equals(item)){
                System.out.println("item is present in "+i+" position");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("item is not found in list");
        }
    }
    
}
