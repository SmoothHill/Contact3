import { createApp } from 'vue';
import App from './App.vue'; // 确保路径正确
import router from './router'; // 确保路径正确

const app = createApp(App);

// 使用路由
app.use(router);

app.mount('#app');
