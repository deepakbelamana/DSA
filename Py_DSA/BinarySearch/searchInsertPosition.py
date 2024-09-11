from typing import List


def searchInsert(self, nums: List[int], target: int) -> int:
    start = 0
    end = len(nums) - 1
    cross = 0
    while start <= end:
        mid = start + (end - start) // 2
        if nums[mid] == target:
            ans = mid
            cross = -1
            break
        if nums[mid] > target:
            end = mid - 1
            cross == 1
        if nums[mid] < target:
            start = mid + 1
            cross = 0
    if cross == -1:
        return ans
    if cross == 0:
        ans = start
    else:
        ans = end + 1
    return ans