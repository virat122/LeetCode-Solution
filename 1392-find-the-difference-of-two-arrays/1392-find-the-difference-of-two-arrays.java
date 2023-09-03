class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

    //     Set<Integer> l1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
    //    Set<Integer> l2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

    //    List<Integer> lst=new ArrayList<>();
    //     List <Integer> lst2=new ArrayList<>();
    //     for(int i=0;i<nums1.length;i++){
    //         if(!l2.contains(nums1[i]) && !lst.contains(nums1[i])){
    //             lst.add(nums1[i]);
    //         }
    //     }
    //     for(int i=0;i<nums2.length;i++){
    //         if(!l1.contains(nums2[i]) && !lst2.contains(nums2[i])){
    //             lst2.add(nums2[i]);
    //         }
    //     }

    //     List<List<Integer>> arr=new ArrayList<List<Integer>>();
    //     arr.add(lst);
    //     arr.add(lst2);
    //     return arr;


    Set<Integer> set1 = new HashSet<>();                           // create 2 hashsets
		Set<Integer> set2 = new HashSet<>();
		for(int num : nums1){ set1.add(num); }                         // add nums1 elements to set1
		for(int num : nums2){ set2.add(num); }                         // add nums2 elements to set2
		
		List<List<Integer>> resultList = new ArrayList<>();             // Initialize result list with 2 empty sublists that we will return
		resultList.add(new ArrayList<>());
		resultList.add(new ArrayList<>());

		for(int num : set1){                                            // just iterate to all elements of set1
			if(!set2.contains(num)){ resultList.get(0).add(num); }      // add those elements to first sublist of result list, which are not in set2.
		}
		for(int num : set2){                                            // just iterate to all elements of set2
			if(!set1.contains(num)){ resultList.get(1).add(num); }      // add those elements to first sublist of result list, which are not in set1
		}
		return resultList;

        





        
    }
}