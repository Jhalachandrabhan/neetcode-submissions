class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stk = new Stack<>();
        
        for(int a :asteroids)
        {
            while(!stk.isEmpty() && a<0 && stk.peek() >0 )
            {
                int diff = a + stk.peek();

                if(diff < 0)
                {
                     stk.pop();
                }
                else if(diff == 0)
                {
                    a = 0;
                    stk.pop();
                }
                else{
                    a=0;
                    
                }
            }
            if(a != 0)
            {
                stk.push(a);
            }
        }
        int[] result = new int[stk.size()];

        for(int i = result.length-1; i>=0; i--)
        {
            result[i] = stk.pop();
        }
        return result;
    }
}