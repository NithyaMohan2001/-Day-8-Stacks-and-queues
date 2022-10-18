class Solution {
    public int calculate(String s) {
        char a[]=s.toCharArray();
        Stack<Integer> stack=new Stack<>();
        char operator='+';
        for(int i=0;i<a.length;i++){
            if(a[i]==' ')
                continue;
            if(Character.isDigit(a[i])){
                StringBuilder buildnum=new StringBuilder();
                while(i<a.length && Character.isDigit(a[i])){
                    buildnum.append(a[i++]);
                }
                i--;
                
                int currnum=Integer.parseInt(buildnum.toString());
                if(operator =='-'){
                    currnum *= -1;
                }else if(operator =='*'){
                    currnum *=stack.pop();
                }else if(operator=='/'){
                    currnum=stack.pop()/currnum;
                }
                stack.push(currnum);
            }else{
                operator=a[i]+1;
            }
                
            }
        int tot=0;
        while(!stack.isEmpty()){
            tot+=stack.pop();
        }
        return tot;
    }
}
