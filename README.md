# HeapSort

A Java implementation of the Heap Sort algorithm to sort a list of fruit names in ascending order (alphabetical order).

## Introduction

Heap Sort is an efficient, comparison-based sorting algorithm that uses a binary heap data structure. It is known for its reliable performance and simplicity, making it a great choice for educational purposes and practical applications alike.

## Features

- Sorts a list of strings in ascending order.

- Demonstrates the heapify process to maintain the max-heap property.

- Uses in-place sorting, requiring no additional memory.

## How to Run

1. **Clone the Repository**:

    ```sh

    git clone https://github.com/0kakarot0/HeapSort.git

    ```

2. **Navigate to the Project Directory**:

    ```sh

    cd HeapSort

    ```

3. **Compile and Run the Program**:

    ```sh

    javac heap_sort/HeapSort.java

    java heap_sort.HeapSort

    ```

## How It Works

The algorithm can be broken down into the following steps:

1. **Build the Max Heap**: 

   - Starting from the last non-leaf node, call the `heapify` function to ensure the max-heap property is maintained.

2. **Extract Elements from the Heap**:

   - Swap the root of the heap (largest element) with the last element in the heap.

   - Reduce the heap size by one and call `heapify` on the root to restore the max-heap property.

   - Repeat this process until the heap is empty.

## Example

Given an unsorted list of fruit names:

```

["banana", "apple", "mango", "pineapple", "orange"]

```

The program will output the sorted list:

```

["apple", "banana", "mango", "orange", "pineapple"]

```

## Repository Structure

```

HeapSort/

├── heap_sort/

│   ├── HeapSort.java

└── README.md

```

## Contributing

Contributions are welcome! Feel free to open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---
