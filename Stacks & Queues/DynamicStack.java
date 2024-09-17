public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super(); // it will call the constructor of super class i.e custom stack
    }
    public DynamicStack(int size){
        super(size); // it will call the CustomStack(int size)
    }
    // we are overriding the push method so that when ever the stack is full it will double the size of arr instead of throwing an exception
    @Override
    public boolean push(int item) throws Exception {
        // this thing takes care of it being full
        if(this.isFull()){
            // double the array size
            int[] temp = new int[data.length*2];

            //copy all the elements from previous array to the new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know that array is not full
        //insert the item
        return super.push(item); // now its inserting it normally using push of CustomStack

    }
}
