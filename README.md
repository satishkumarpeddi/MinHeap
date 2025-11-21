# MinHeap Visualization Using JavaFX

An interactive graphical tool to visualize how a Min-Heap data structure works (insertions, removals, bubbling/up-heap, down-heap) built with Java and JavaFX.

## 🚀 Features  
- Real-time visualization of inserting values into the Min Heap.  
- Extraction of the minimum element (root) with live re-heapification and animations.  
- Dynamic tree representation — nodes are drawn as circles, connected via edges, reposition automatically as operations occur.  
- User-friendly GUI built with JavaFX: input fields, buttons, and visual feedback for invalid operations.  
- Clean codebase: custom Min Heap implementation, separation of logic & UI.

## 🧰 Technology Stack  
- Java (SE)  
- JavaFX for GUI, scene graph, animations  
- Maven for build and dependency management  
- Follows MVC-style separation (heap data structure logic vs UI presentation)

## 🎯 Why This Project?  
Min Heaps are fundamental in algorithms and data structures (priority queues, heap sort, Dijkstra's algorithm, event simulation). But the internal operations (bubble-up, down-heap, array-based tree representation) are often abstract.  
This tool helps by providing **visual clarity** to how the heap evolves as we insert elements or remove the minimum.

## Getting Started

### Prerequisites  
- Java 11 or later  
- JavaFX (if using external library, ensure proper JavaFX modules or SDK)  
- Maven (to build and run)

### Build & Run  
```bash
git clone https://github.com/satishkumarpeddi/MinHeap.git
cd MinHeap
mvn clean install
mvn javafx:run      # or your preferred way to launch JavaFX application
Usage
Launch the application.

Enter a value in the input field and click Insert to add it into the heap.

Click Extract-Min to remove the smallest element and watch the tree restructure.

Observe the tree visually: nodes move and swap according to heap operations.

Invalid operations (e.g., extract from empty heap) will show a warning.

📚 What I Learned
How to implement a Min Heap (array-based, parent/child index relationships, bubble up/down).

How to connect data structure logic to a UI portrayal: nodes as visual elements, tree layout updates.

Handling dynamic layout and animation in JavaFX: repositioning nodes, smooth transitions, user feedback.

Better UI/UX for algorithm education tools.

🔮 Future Improvements
Add step-by-step mode: let the user proceed one operation at a time with explanations.

Support for Max Heap mode or other tree-based structures (e.g., binary search tree).

Export current heap state as an image or JSON for sharing or unit testing.

More advanced animations (highlighting the nodes being swapped, colour changes).

Responsive layout: handle large heaps gracefully (scrolling, zooming).

📝 License
Licensed under the MIT License — feel free to use, adapt or enhance this tool for your educational or development needs.
