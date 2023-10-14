const originalArray = [5, 2, 9, 1, 5, 6, 3];

// Sorting the array in descending order
originalArray.sort(function(a, b) {
  return b - a;
});

console.log("Sorted array in descending order: " + originalArray);
