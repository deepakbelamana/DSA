def findKRotation(arr):
    start = 0
    end = len(arr) - 1
    n = len(arr)
    while start <= end:
        mid = start + (end - start) // 2
        next = (mid + 1) % n
        prev = (mid + n - 1) % n
        if arr[mid] <= arr[prev] and arr[mid] <= arr[next]:
            return mid
        elif arr[start] > arr[mid]:
            end = mid - 1
        elif arr[mid] > arr[end]:
            start = mid + 1
    return 0

if __name__ == '__main__':
    print(findKRotation([3,4,5,1,2]))