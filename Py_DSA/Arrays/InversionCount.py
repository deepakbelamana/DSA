def mergeSort(self, arr, low, high):
    ct = 0
    if low >= high:
        return 0  # Return 0 when there are no elements to merge
    mid = (low + high) // 2  # Integer division
    ct += self.mergeSort(arr, low, mid)  # Recursively sort and count left half
    ct += self.mergeSort(arr, mid + 1, high)  # Recursively sort and count right half
    ct += self.merge(arr, low, mid, high)  # Merge and count split inversions
    return ct


def merge(self, arr, low, mid, high):
    ct = 0
    tem = []
    left = low
    right = mid + 1

    # Merging two halves and counting inversions
    while left <= mid and right <= high:
        if arr[left] <= arr[right]:
            tem.append(arr[left])
            left += 1
        else:
            tem.append(arr[right])
            right += 1
            ct += (mid - left + 1)  # Count inversions

    # Copy remaining elements from the left half
    while left <= mid:
        tem.append(arr[left])
        left += 1

    # Copy remaining elements from the right half
    while right <= high:
        tem.append(arr[right])
        right += 1

    # Copy the sorted elements back to the original array
    for i in range(low, high + 1):
        arr[i] = tem[i - low]

    return ct


def inversionCount(self, arr, n):
    count = self.mergeSort(arr, 0, n - 1)
    return count
