from typing import List


def sortColors(self, nums: List[int]) -> None:
    low = 0
    high = len(nums) - 1
    mid = 0
    for i in range(0, len(nums)):
        if nums[mid] == 0:
            temp = nums[mid]
            nums[mid] = nums[low]
            nums[low] = temp
            low += 1
            mid += 1
        elif nums[mid] == 1:
            mid += 1
        else:
            temp = nums[mid]
            nums[mid] = nums[high]
            nums[high] = temp
            high -= 1