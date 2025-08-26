from collections import deque

def maxSlidingWindow(nums, k):
    """
    LeetCode 239: Sliding Window Maximum
    -----------------------------------
    Given an array nums and an integer k, find the maximum value in every sliding window of size k.
    Time Complexity: O(n) using deque.
    
    :param nums: List[int] - Input array
    :param k: int - Window size
    :return: List[int] - Maximums of each window
    """
    if not nums or k == 0:
        return []

    dq = deque()  # Stores indices, front is the max of the window
    result = []

    for i in range(len(nums)):
        # Remove indices that are out of the current window
        if dq and dq[0] == i - k:
            dq.popleft()

        # Remove smaller values as they are useless
        while dq and nums[dq[-1]] < nums[i]:
            dq.pop()

        dq.append(i)

        # Append result only after the first k-1 elements
        if i >= k - 1:
            result.append(nums[dq[0]])

    return result


# Example usage:
if __name__ == "__main__":
    arr = [1,3,-1,-3,5,3,6,7]
    k = 3
    print(maxSlidingWindow(arr, k))  # Output: [3,3,5,5,6,7]
