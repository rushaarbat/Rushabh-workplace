class UserDetail extends HTMLElement {
  constructor() {
    super();
    this.innerHTML = "This is our first web component";
  }
}
window.customElements.define("user-detail", UserDetail);
