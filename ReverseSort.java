    public static void reverse(int[] input , int start , int end){
        while (start<end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }

    public static int[] reverseSort(int[] input){
        int length = input.length;
        for(int i = 0 ; i < length - 1 ; i++){
            int min = i;
            for(int j = i +1; j < length ; j++ ){
                if(input[j]<input[min])min=j;
            }
            reverse(input,i,min);
            System.out.println(Arrays.toString(input));
        }
        return input;
    }