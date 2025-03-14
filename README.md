# Results of the JMeter Tests via GUI

## 1️⃣ Endpoint: `/all-student`
- **View Results Tree** : ![image](screenshots/all-student-tree.png)
- **View Results in Table** : ![image](screenshots/all-student-table.png)
- **Summary Report** : ![image](screenshots/all-student-summary.png)
- **Graph Results** : ![image](screenshots/all-student-graph.png)

---

## 2️⃣ Endpoint: `/all-student-name`
- **View Results Tree** : ![image](screenshots/all-student-name-tree.png)
- **View Results in Table** : ![image](screenshots/all-student-name-table.png)
- **Summary Report** : ![image](screenshots/all-student-name-summary.png)
- **Graph Results** : ![image](screenshots/all-student-name-graph.png)

---

## 3️⃣ Endpoint: `/highest-gpa`
- **View Results Tree** : ![image](screenshots/highest-gpa-tree.png)
- **View Results in Table** : ![image](screenshots/highest-gpa-table.png)
- **Summary Report** : ![image](screenshots/highest-gpa-summary.png)
- **Graph Results** : ![image](screenshots/highest-gpa-graph.png)


# Results of the JMeter Tests via command line

## 1️⃣ Endpoint: `/all-student`
- **test_result_log1.jtL** : ![image](screenshots/test-1-viacommandline.png)

---

## 2️⃣ Endpoint: `/all-student-name`
- **test_result_log2.jtL** : ![image](screenshots/test-2-viacommandline.png)

---

## 3️⃣ Endpoint: `/highest-gpa`
- **test_result_log3.jtL** : ![image](screenshots/test-3-viacommandline.png)


### Analyse of the JMeter Tests results after optimization

## 1️⃣ Endpoint: `/all-student`
- **Before Optimization** : ![image](screenshots/test-1-viacommandline.png)
- **After Optimization** : ![image](screenshots/test-1-viacommandline_after_optimization.png)

---

## 2️⃣ Endpoint: `/all-student-name`
- **Before Optimization** : ![image](screenshots/test-2-viacommandline.png)
- **After Optimization** : ![image](screenshots/test-2-viacommandline_after_optimization.png)

---

## 3️⃣ Endpoint: `/highest-gpa`
- **Before Optimization** : ![image](screenshots/test-3-viacommandline.png)
- **After Optimization** : ![image](screenshots/test-3-viacommandline_after_optimization.png)

After optimizing the joinStudentNames() and findStudentWithHighestGpa() methods by reducing the use of findAll() and replacing it with more efficient queries, we conducted a new performance test using JMeter.

- Response Time: We observed a significant reduction in execution time for both methods, indicating faster data retrieval.
- Throughput: The number of requests handled per second increased, demonstrating improved efficiency.
- Database Load: The optimized queries reduced the amount of data fetched, lowering the overall database workload.

The optimizations have successfully improved the application's performance by reducing unnecessary data retrieval. Instead of loading all student records and processing them in memory, we now fetch only the necessary data directly from the database, making the application more efficient and scalable


# Reflection

### Difference between JMeter and IntelliJ Profiler:
JMeter focuses on external performance testing by simulating user load, while IntelliJ Profiler provides in-depth insights into CPU, memory, and execution bottlenecks at the code level.

### How profiling helps identify weak points:
Profiling helps pinpoint inefficient methods, excessive memory usage, and slow database queries, allowing targeted optimizations.

### Effectiveness of IntelliJ Profiler:
IntelliJ Profiler is effective in identifying performance bottlenecks, as it provides real-time metrics on method execution times and resource consumption.

### Challenges in performance testing and profiling:
Challenges include setting up realistic test scenarios, handling variable workloads, and interpreting results accurately. These are overcome by running multiple test iterations and cross-checking findings.

### Benefits of using IntelliJ Profiler:
It provides detailed execution insights, helps visualize performance bottlenecks, and allows precise optimizations without guesswork.

### Handling inconsistencies between profiling and JMeter results:
When profiling results differ from JMeter findings, I analyze different testing conditions, validate database interactions, and rerun tests to ensure accuracy.

### Optimization strategies and ensuring functionality:
After analyzing test results, I focus on query optimization, algorithm improvements, and caching.
