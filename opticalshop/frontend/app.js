const baseUrl = "http://localhost:8080/products";

// Add product
function addProduct() {
    fetch(baseUrl + "/add", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
            name: document.getElementById("name").value,
            price: document.getElementById("price").value,
            stock: document.getElementById("stock").value
        })
    })
    .then(res => res.text())
    .then(data => alert(data));
}

// Buy product
function buyProduct() {
    fetch(baseUrl + "/buy", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({
            productName: document.getElementById("bname").value,
            quantity: document.getElementById("qty").value
        })
    })
    .then(res => res.text())
    .then(data => alert(data));
}

// Get all products
function getProducts() {
    fetch(baseUrl)
    .then(res => res.json())
    .then(data => {
        document.getElementById("output").innerText =
            JSON.stringify(data, null, 2);
    });
}