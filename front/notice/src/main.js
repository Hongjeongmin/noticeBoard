import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'
import Mainpage from '@/pages/Main.vue'
import Loginpage from '@/pages/Login.vue'
Vue.use(VueRouter)
Vue.config.productionTip = false

const routes = [
  {
    path: '/',
    component: Loginpage
  },
  {
    path: '/login',
    component: Mainpage
  }
];

const router = new VueRouter({
  routes
});

new Vue({
  render: h => h(App),
  router
}).$mount('#app')
