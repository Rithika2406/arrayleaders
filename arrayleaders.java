class Main {
    public static void main(String[] args) {
        int arr[]={16,17,45,3,4};
        int j;
        for(int i=0;i<arr.length;i++)
        {
            for( j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    break;
                }
            }
            if( j==arr.length)
            {
                System.out.println(arr[i]);
        }
        
    }
}}