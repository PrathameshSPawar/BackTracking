https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/description/?envType=daily-question&envId=2025-03-23
class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        {
            return new ArrayList<String>();
        }
        List<String> ans=new LinkedList<>();
        StringBuilder str=new StringBuilder();
        helper(str,digits,0,ans);
        return ans;
    }

    public String keyPad[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public void helper(StringBuilder neww,String str,int i,List<String> ans)
    {
        if(i>=str.length())
        {
            ans.add(neww.toString());
            return;
        }
        int ind=str.charAt(i)-'0';
        for(int j=0;j<keyPad[ind].length();j++)
        {
            neww.append(keyPad[ind].charAt(j));
            helper(neww,str,i+1,ans);
            neww.deleteCharAt(neww.length()-1);
        }
    }
}
