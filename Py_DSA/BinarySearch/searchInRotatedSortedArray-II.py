from typing import List


def search(self, nums: List[int], target: int) -> bool:
    start = 0
    end = len(nums) - 1
    while (start <= end):
        mid = start + (end - start) // 2
        if nums[mid] == target:
            return True
        #[10111] if all start,mid and end are equal we need to avoid this
        #case and continue by shrinking the array
        if nums[mid] == nums[start] and nums[mid] == nums[end]:
            start += 1
            end -= 1
            continue
        if nums[start] <= nums[mid]:
            if target >= nums[start] and target <= nums[mid]:
                end = mid - 1
            else:
                start = mid + 1
        else:
            if nums[mid] <= nums[end]:
                if nums[mid] <= target and target <= nums[end]:
                    start = mid + 1
                else:
                    end = mid - 1
    return False