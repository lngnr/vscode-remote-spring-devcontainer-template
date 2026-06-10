# 1. Setup IDE

1. [Install VSCode](https://code.visualstudio.com/download)
2. Install remote development extensions in VSCode
- **Via Plugin Browser**: Search for the extension pack `Remote Development` by Microsoft. Click install
- **Via command**: Press Ctrl + P (in VSCode). Type `ext install ms-vscode-remote.vscode-remote-extensionpack` and confirm.

Your IDE is set up.

## 1.1 Setup remote (first time only) (admin)

1. Install any Linux Distribution that [supports docker](https://docs.docker.com/engine/install/).
2. [Install docker engine](https://docs.docker.com/engine/install/).
3. Add a new user. E. g. (Ubuntu 26.04):
```bash

NEW_USER_TO_ADD=...

sudo useradd -d "/home/$NEW_USER_TO_ADD" -m -s /bin/bash
sudo passwd "$NEW_USER_TO_ADD"
# Set password

sudo usermod -aG docker "$NEW_USER_TO_ADD"
sudo id "$NEW_USER_TO_ADD"
# Check if user setup is correct
```

# 2. Log into remote

1. Press F1 (VSCode) and type `Remote-SSH: Connect to host...`. Select it.
2. *First time*: Select `Add remote`. Login via SSH.
3. Select the remote. Enter the SSH password for the remote user.

You are logged in.

# 3. Clone the repository

1. Open a new terminal (VSCode) and enter `git clone ...`. You might need to [authenticate](https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent) yourself.
2. Open the generated folder in VSCode.
3. Press F1 (VSCode) and type `Dev Containers: Reopen in container`. Select it. The container should boot.

You are good to go (The lower left corner of VSCode should display `Dev Container: Java & PostgreSQL @ ...`).
