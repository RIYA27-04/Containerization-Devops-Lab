from flask import Flask

app = Flask(__name__)

@app.route("/")
def home():
    return "Hello Flask Running in Docker"

@app.route("/config")
def config():
    return {"status": "running", "app": "flask-env-app"}

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)