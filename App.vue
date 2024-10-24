<template>
  <div id="app">
    <Contact />
  </div>
</template>

<script setup>
import Contact from './components/contacts.vue'
</script>

<style>
/* 您可以在这里添加全局样式，或者保留当前的 scoped 样式 */
#app {
  max-width: 600px;
  margin: 0 auto;
  padding: 20px;
}

.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 10px;
  background-color: #f7f7f7;
}

.close-button {
  cursor: pointer;
  background: none;
  border: none;
  font-size: 20px;
}

.container {
  margin: 20px;
}

.input-group {
  margin-bottom: 10px;
}

.input-group label {
  display: block;
  margin-bottom: 5px;
}

.input-group input {
  width: 100%;
  padding: 8px;
  margin-bottom: 10px;
}

.button-group {
  display: flex;
  justify-content: space-between;
}

.button {
  padding: 10px 20px;
  cursor: pointer;
  background-color: #007bff;
  color: white;
  border: none;
  border-radius: 5px;
}

.button:hover {
  background-color: #0056b3;
}
</style>
