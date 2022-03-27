import { createApp } from 'vue'
import App from './App.vue'
import router from '@/router'

let app= createApp(App).mount('#app')
//全局安装路由组件
app.use(router).mount('#app')

