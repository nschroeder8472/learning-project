"""Exercise 2: Load Balancing"""
from typing import List
from abc import ABC, abstractmethod

class Server:
    def __init__(self, server_id: str):
        self.id = server_id
        self.connections = 0
        self.healthy = True

class RoundRobinLoadBalancer:
    def __init__(self, servers: List[Server]):
        # TODO: Implement round-robin
        raise NotImplementedError()

    def get_next_server(self) -> Server:
        raise NotImplementedError()

class LeastConnectionsLoadBalancer:
    def __init__(self, servers: List[Server]):
        # TODO: Implement least connections
        raise NotImplementedError()

    def get_next_server(self) -> Server:
        raise NotImplementedError()
