import sys


def findKRotation(nums):
    start = 0
    end = len(nums) - 1
    ans = sys.maxsize
    res = 0
    while (start <= end):
        mid = start + (end - start) // 2
        # if nums[start]<=nums[end]:
        #     if(nums[start]<ans):
        #         ans=nums[start]
        #         res=start
        #     break
        if nums[start] <= nums[mid]:
            if (nums[start] < ans):
                ans = nums[start]
                res = start
            start = mid + 1
        if nums[mid] <= nums[end]:
            if (nums[end] < ans):
                ans = nums[mid]
                res = mid
            end = mid - 1
    return res

if __name__ == '__main__':
    print(findKRotation([3,4,5,1,2]))