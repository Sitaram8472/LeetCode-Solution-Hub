# 📝 Approach: Longest Subarray with Sum K

## ✅ Beginner-Friendly Explanation:

What we have to do is find the **longest subarray** whose sum is equal to `K`. This subarray can be the entire array or just a part of it.

So, here’s what I did:

1. I used a **HashMap** and a **prefix sum** concept.
2. As we iterate through the array, we keep calculating the **prefix sum** — which basically means the sum of all elements from the start till the current index.
3. For each prefix sum, we check:
   - If the prefix itself is equal to `K`, that means the subarray from the **start to current index** has sum `K`, so we update our answer with that length.
   - If not, we check if **`prefix - K`** exists in the map.  
     Why? Because if at some earlier index, the sum was `prefix - K`, then the subarray between that index and the current one will have a sum of `K`.

4. We store each prefix sum in the map with its **first occurrence index**.  
   (First occurrence is important because we want the **longest possible** subarray.)

5. At every step, we keep track of the maximum length of such subarrays.

---

## 💡 Intuition (Reverse Engineering):

This approach works like **reverse engineering the sum**.

Let’s say at index `i`, the total sum is `prefix = 15` and `K = 7`.  
Now you think:  
**“What if earlier I had a sum of `8`? Then the subarray between that old index and `i` would sum to 7!”**  
So we check if `prefix - K` (i.e. `15 - 7 = 8`) exists in the map.  
If yes, we know we can cut off that part, and we get the remaining subarray with sum `K`.

This thinking is similar to:  
➡️ *“I know my current total — let me subtract and go back to see if I had the remaining part earlier.”*

That’s why we call it **reverse engineering the prefix**.

---

## ✨ Dry Run Example:

```text
Input: nums = [1, 2, 3, 1, 1, 1, 1], K = 5

Prefix Sum while traversing:
Index 0: sum = 1
Index 1: sum = 3
Index 2: sum = 6 → 6 - 5 = 1 → found at index 0 → subarray (1, 2) → length = 2
Index 3: sum = 7 → 7 - 5 = 2 → not found
Index 4: sum = 8 → 8 - 5 = 3 → found at index 1 → subarray (3, 1, 1) → length = 3
...

Final Answer = 3.
```
---

## ⏱ Time & Space Complexity: Dry Run Example:

- **Time Complexity:** `O(n)`  
  We iterate through the array once, and all operations with the HashMap (`get`, `put`, `containsKey`) are constant time.

check this md file correct or not
- **Space Complexity:** `O(n)`  
  In the worst case, we may store up to `n` unique prefix sums in the HashMap.