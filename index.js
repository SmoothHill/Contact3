import { createRouter, createWebHistory } from 'vue-router';
import Contacts from '../components/contacts.vue';

const routes = [
    {
        path: '/',
        name: 'Contacts',
        component: Contacts,
    },
    // 可以在这里添加更多的路由规则
];

const router = createRouter({
    history: createWebHistory('/'), // 直接使用 '/' 或者其他您想要的基础路径
    routes,
});

export default router;
