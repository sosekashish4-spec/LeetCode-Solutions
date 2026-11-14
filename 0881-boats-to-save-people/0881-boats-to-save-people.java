class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int boat=0;
        while(i<=j){
            if(people[j]==limit) boat++;
            else if(i==j) boat++;
            else{
                if(people[i]+people[j]<=limit) i++;
                boat++;
            }
            j--;
        }
         
        return boat;
    }
}