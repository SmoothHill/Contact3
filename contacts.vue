<template>
  <div class="header">
    <h1>通讯录系统</h1>
    <button class="close-button" @click="closeApp">X</button>
  </div>

  <div class="container">
    <div class="input-group">
      <label for="name">姓名：</label>
      <input type="text" v-model="contact.name" placeholder="输入姓名">
    </div>
    <div class="input-group">
      <label for="address">地址：</label>
      <input type="text" v-model="contact.address" placeholder="输入地址">
    </div>
    <div class="input-group">
      <label for="phone">电话：</label>
      <input type="text" v-model="contact.phone" placeholder="输入电话">
    </div>
    <div class="button-group">
      <button class="button" @click="addContact">增加</button>
      <button class="button" @click="updateContact">更改</button>
      <button class="button" @click="deleteContact">删除</button>
      <button class="button" @click="viewContacts">查看</button>
    </div>
  </div>
  <div class="footer">
    <textarea placeholder="在这里输入多行文本"></textarea>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      contact: {
        name: '',
        address: '',
        phone: ''
      },
      contacts: []
    };
  },
  methods: {
    closeApp() {
      window.close(); // 如果是在新窗口打开的页面，可以关闭窗口
    },
    viewContacts() {
      axios.get('/api/contacts')
          .then(response => {
            this.contacts = response.data;
          })
          .catch(error => {
            console.error('Error fetching contacts:', error);
          });
    },
    addContact() {
      axios.post('/api/contacts', this.contact)
          .then(response => {
            this.viewContacts(); // 重新加载联系人列表
            this.resetContactForm();
          })
          .catch(error => {
            console.error('Error adding contact:', error);
          });
    },
    updateContact() {
      axios.put(`/api/contacts/${this.contact.id}`, this.contact)
          .then(response => {
            this.viewContacts(); // 重新加载联系人列表
            this.resetContactForm();
          })
          .catch(error => {
            console.error('Error updating contact:', error);
          });
    },
    deleteContact() {
      axios.delete(`/api/contacts/${this.contact.id}`)
          .then(response => {
            this.viewContacts(); // 重新加载联系人列表
            this.resetContactForm();
          })
          .catch(error => {
            console.error('Error deleting contact:', error);
          });
    },
    resetContactForm() {
      this.contact = {
        name: '',
        address: '',
        phone: ''
      };
    }
  },
  created() {
    this.viewContacts();
  }
};
</script>

<style>
/* 你可以在这里添加CSS样式 */
.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 10px;
  background-color: #f5f5f5;
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

.input-group input,
.input-group textarea {
  width: 100%;
  padding: 8px;
  margin-bottom: 20px;
  box-sizing: border-box;
}

.button-group button {
  margin-right: 10px;
}

.footer {
  margin-top: 20px;
  text-align: center;
}

.footer textarea {
  width: 80%;
  min-height: 100px;
  padding: 8px;
}
</style>
