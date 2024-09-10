from typing import List

def reversePairs(nums: List[int]) -> int:
    count = mergeSort(nums, 0, len(nums) - 1)
    return count

def mergeSort(nums, low, high):
    ct = 0
    if low >= high:
        return 0
    mid = (low + high) // 2  # Use integer division here
    ct += mergeSort(nums, low, mid)
    ct += mergeSort(nums, mid + 1, high)
    ct += merge(nums, low, mid, high)
    return ct

def merge(nums, low, mid, high):
    ct = 0
    left = low
    right = mid + 1
    tem = []
    # Count reverse pairs
    while left <= mid and right <= high:
        if nums[left] > 2 * nums[right]:
            ct += (mid - left + 1)
            right += 1
        else:
            left += 1

    # Merge two sorted halves
    left = low
    right = mid + 1
    while left <= mid and right <= high:
        if nums[left] <= nums[right]:
            tem.append(nums[left])
            left += 1
        else:
            tem.append(nums[right])
            right += 1

    while left <= mid:
        tem.append(nums[left])
        left += 1

    while right <= high:
        tem.append(nums[right])
        right += 1

    # Copy sorted elements back into original array
    nums[low:high + 1] = tem
    return ct

if __name__ == '__main__':
    print(reversePairs([1, 3, 2, 3, 1]))  # Example usage
