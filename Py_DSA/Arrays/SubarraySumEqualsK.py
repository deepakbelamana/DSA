from typing import List


def subarraySum( nums: List[int], k: int) -> int:
    dc = {}
    i = 0
    prsum = 0
    count = 0
    dc[0] = 1
    while (i < len(nums)):
        prsum += nums[i]
        remove = prsum - k
        if prsum - k in dc.keys():
            count += dc[prsum - k]
        if prsum in dc.keys():
            dc[prsum] += 1
        else:
            dc[prsum] = 1
        i += 1
    return count

if __name__ == '__main__':
    print(subarraySum([1,2,3],3))