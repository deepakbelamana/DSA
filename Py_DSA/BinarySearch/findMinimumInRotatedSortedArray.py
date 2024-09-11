def findMin(self, nums: List[int]) -> int:
    start = 0
    end = len(nums) - 1
    ans = sys.maxsize
    while (start <= end):
        mid = start + (end - start) // 2
        if nums[start] <= nums[end]:
            ans = min(ans, nums[start])
            break
        if nums[start] <= nums[mid]:
            ans = min(ans, nums[start])
            start = mid + 1
        if nums[mid] <= nums[end]:
            ans = min(ans, nums[mid])
            end = mid - 1
    return ans