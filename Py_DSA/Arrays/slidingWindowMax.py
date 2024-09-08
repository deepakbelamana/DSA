import collections
from collections import deque


def max_of_subarrays(nums, n, k):
    output = []
    q = deque()  # index
    l = r = 0
    while r < n:
        while q and nums[q[-1]] < nums[r]:
            q.pop()
        q.append(r)
        # remove Left val from window
        if l > q[0]:
            q.popleft()
        if (r + 1) >= k:
            output.append(nums[q[0]])
            l += 1
        r += 1
    return output


if __name__ == '__main__':
    print(max_of_subarrays([1,3,-1,-3,5,3,6,7], 8, 3))
